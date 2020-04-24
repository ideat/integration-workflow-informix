package com.mindware.integration.task;

import com.mindware.integration.dao.*;
import com.mindware.integration.entity.*;
import com.mindware.integration.entity.workflow.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class getApplicant {
    @Autowired
    MapperGbage mapperGbage;

    @Autowired
    MapperGbdir mapperGbdir;

    @Autowired
    MapperGbdac mapperGbdac;

    @Autowired
    MapperGbdpt mapperGbdpt;

    @Autowired
    MapperGbprv mapperGbprv;

    @Autowired
    MapperGbdoc mapperGbdoc;

    @Autowired
    MapperGbdbi mapperGbdbi;

    public Applicant armApplicant(Integer gbagecage, List<String> extensionCardList){
        Applicant applicant = new Applicant();

        Gbage gbage = mapperGbage.getById(gbagecage);
        Gbdir gbdir = mapperGbdir.getById(gbagecage);
        Gbdac gbdac = mapperGbdac.getById(gbagecage);
        List<Gbdpt> gbdptList = mapperGbdpt.getAll();
        List<Gbprv> gbprvList = mapperGbprv.getAll();
        Gbdoc gbdoc = mapperGbdoc.getById(gbagecage);
        Gbdbi gbdbi = mapperGbdbi.getById(gbagecage);


        applicant.setFirstName(gbdac.getGbdacnom1());
        applicant.setSecondName(gbdac.getGbdacnom2()==null?"":gbdac.getGbdacnom2());
        applicant.setLastName(gbdac.getGbdacape1()==null?"":gbdac.getGbdacape1());
        applicant.setMotherLastName(gbdac.getGbdacape2()==null?"":gbdac.getGbdacape2());
        applicant.setMarriedLastName(gbdac.getGbdacape3()==null?"":gbdac.getGbdacape3());

        if(gbdir!=null){
            Optional<Gbdpt> gbdpt = gbdptList.stream().filter(g -> g.getGbdptdpto().equals(gbdir.getGbdirdpto())).findFirst();
            if(gbdpt.isPresent()){
                applicant.setCity(gbdpt.get().getGbdptdesc()==null?"":gbdpt.get().getGbdptdesc().trim());
            }

            Optional<Gbprv> gbprv = gbprvList.stream().filter(g -> g.getGbprvcprv().equals(gbdir.getGbdircprv())).findFirst();
            if(gbprv.isPresent()) {
                applicant.setProvince(gbprv.get().getGbprvdesc()==null?"":gbprv.get().getGbprvdesc());
            }

            applicant.setBlock(gbdir.getGbdirubn4()==null?"":gbdir.getGbdirubn4());
            if(gbdbi!=null){
                applicant.setTypeHome(gbdbi.getGbdbitviv()==null?"":gbdbi.getGbdbitviv());
            }
            String addressHome = gbdir.getGbdirdire()==null?"":gbdir.getGbdirdire() + " "
                    + gbdir.getGbdirrefe()==null?"":gbdir.getGbdirrefe();
            applicant.setHomeaddress(addressHome);
            applicant.setIdCarcComplement(gbage.getGbagecomp()==null?"":gbage.getGbagecomp());

            applicant.setIdCard(gbage.getGbagendid()==null?"":gbage.getGbagendid()); //fixme get only numeric part




        }

        return applicant;
    }



}
