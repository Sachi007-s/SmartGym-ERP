package SmartGym_ERP.controller;

import SmartGym_ERP.entity.Trainer;
import SmartGym_ERP.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainers")
@CrossOrigin // Frontend එකයි Backend එකයි අතර ප්‍රශ්නයක් නැතුව දත්ත හුවමාරු වෙන්න මේක ඕනේ
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    // 1. අලුත් Trainer කෙනෙක්ව ඇතුළත් කරන්න (POST Request)
    @PostMapping
    public Trainer createTrainer(@RequestBody Trainer trainer) {
        return trainerService.saveTrainer(trainer);
    }

    // 2. දැනට ඉන්න ඔක්කොම Trainers ලාගේ ලිස්ට් එක ලබාගන්න (GET Request)
    @GetMapping
    public List<Trainer> getAllTrainers() {
        return trainerService.getAllTrainers();
    }
}