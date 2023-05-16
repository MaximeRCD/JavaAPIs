package org.tse.mr.restAPI.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.tse.mr.restAPI.dao.FootballPlayerRepository;
import org.tse.mr.restAPI.dao.FootballTeamRepository;
import org.tse.mr.restAPI.domain.FootballPlayer;
import org.tse.mr.restAPI.domain.FootballTeam;

@Component
public class RestApiApplicationRunner implements ApplicationRunner {
    @Autowired
    private FootballTeamRepository footballTeamRepository;
    @Autowired
    private FootballPlayerRepository footballPlayerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FootballPlayer neymar = new FootballPlayer();
        neymar.setName("Neymar");
        neymar.setAge(30);
        neymar.setNumber(10);
        neymar.setPosition("MOC");
        this.footballPlayerRepository.save(neymar);

        FootballPlayer donnarumma = new FootballPlayer();
        donnarumma.setName("Gianluigi Donnarumma");
        donnarumma.setAge(23);
        donnarumma.setNumber(99);
        donnarumma.setPosition("G");
        this.footballPlayerRepository.save(donnarumma);

        FootballTeam psg = new FootballTeam();
        psg.setCity("Paris");
        psg.setName("PSG");
        this.footballTeamRepository.save(psg);

        FootballTeam om = new FootballTeam();
        om.setCity("Marseille");
        om.setName("OM");
        this.footballTeamRepository.save(om);

        FootballTeam lyon = new FootballTeam();
        lyon.setCity("Lyon");
        lyon.setName("LYON");
        this.footballTeamRepository.save(lyon);
    }

}
