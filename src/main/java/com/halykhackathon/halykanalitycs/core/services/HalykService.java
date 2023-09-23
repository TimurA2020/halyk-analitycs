package com.halykhackathon.halykanalitycs.core.services;

import com.halykhackathon.halykanalitycs.core.repositories.HalykRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HalykService {

    private final HalykRepository halykRepository;

}
