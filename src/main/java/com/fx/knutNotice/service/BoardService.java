package com.fx.knutNotice.service;

import com.fx.knutNotice.domain.GeneralNewsRepository;
import com.fx.knutNotice.domain.entity.GeneralNews;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardService {

    private final GeneralNewsRepository generalNewsRepository;

    public List<GeneralNews> showBoardList() {
        List<GeneralNews> generalNewsList = generalNewsRepository.findAll();
        return new ArrayList<>(generalNewsList);
    }



}
