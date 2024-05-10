package com.fx.knutNotice.service;

import com.fx.knutNotice.domain.AcademicNewsRepository;
import com.fx.knutNotice.domain.EventNewsRepository;
import com.fx.knutNotice.domain.GeneralNewsRepository;
import com.fx.knutNotice.domain.ScholarshipNewsRepository;
import com.fx.knutNotice.dto.RecentThreeTitleDTO;
import com.fx.knutNotice.web.form.ResponseForm.MainForm;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MainHomeService {

    private final GeneralNewsRepository generalNewsRepository;
    private final ScholarshipNewsRepository scholarshipNewsRepository;
    private final EventNewsRepository eventNewsRepository;
    private final AcademicNewsRepository academicNewsRepository;

    public MainForm showMainTopThreeTitle() {
        List<RecentThreeTitleDTO> generalNewsRecent3Title = generalNewsRepository.findRecent3Title();
        List<RecentThreeTitleDTO> scholarshipNewsRecent3Title = scholarshipNewsRepository.findRecent3Title();
        List<RecentThreeTitleDTO> eventNewsRecent3Title = eventNewsRepository.findRecent3Title();
        List<RecentThreeTitleDTO> academicNewsRecent3Title = academicNewsRepository.findRecent3Title();

        return new MainForm(generalNewsRecent3Title, scholarshipNewsRecent3Title,
            eventNewsRecent3Title, academicNewsRecent3Title);
    }


}