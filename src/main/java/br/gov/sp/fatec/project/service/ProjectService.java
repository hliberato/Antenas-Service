package br.gov.sp.fatec.project.service;

import br.gov.sp.fatec.project.domain.Project;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project findById(Long id);

    List<Project> findAll();

    Project update(Project project);

    void delete(Long projectId);
}
