package com.hnure.interactive.repository;

import com.hnure.interactive.jpa.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Long> {
    // List<PlayerStats>findFirst10ByGameOrderByRatioAndWrongAnswers (String Game);
    //  List<PlayerStats>findFirst10ByNameOrderByRatioAndWrongAnswers (String Name);
}
