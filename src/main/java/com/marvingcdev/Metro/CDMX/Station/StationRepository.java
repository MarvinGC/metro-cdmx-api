package com.marvingcdev.Metro.CDMX.Station;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {
    @Query("SELECT s FROM Station s WHERE s.Name LIKE %:name%")
    List<Station> searchByName(@Param("name") String name);
}
