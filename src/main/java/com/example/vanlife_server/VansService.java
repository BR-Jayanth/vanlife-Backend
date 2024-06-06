package com.example.vanlife_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VansService {

    @Autowired
    private VansRepository vansRepository;

    List<VansModal> getVans() {
        //to get all vans
        List<VansModal> data = vansRepository.findAll();
        return data;
    }


    List<Optional<VansModal>> getVan(String id){
        // to get van based on vanId
        List<Optional<VansModal>> data= vansRepository.findByVanId(id);
        return data;
    }

    List<Optional<VansModal>>  getHostVans( String hostId) {
        // to retriew  van based on hostId
        List<Optional<VansModal>>  data = vansRepository.findByHostId(hostId);
        return data;
    }
}
