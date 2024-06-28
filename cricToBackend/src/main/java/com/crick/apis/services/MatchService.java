package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {


    List<Match> getAllMatches();

// get live matches


    List<Match> getLiveMatches();
    // get cwc2023 point table Endpoints

    List<List<String>> getPointTable();
}
