package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String showDiceForm() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String rollDice(@RequestParam(name="guess") String guess, Model model) {
        model.addAttribute("guess", guess);
        model.addAttribute("diceRoll", rollDice());
        model.addAttribute("message", getMessage(Integer.parseInt(guess), rollDice()));
        return "roll-dice";
    }

    private int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    private String getMessage(int guess, int diceRoll) {
        if (guess == diceRoll) {
            return "Congratulations! You guessed correctly!";
        } else {
            return "rolled " + diceRoll + ". Better luck next time!";
        }
    }
}
