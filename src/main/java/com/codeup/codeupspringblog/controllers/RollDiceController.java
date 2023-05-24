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
    public String rollDice(@PathVariable int guess, Model model) {
        int diceRoll = rollDice();
        model.addAttribute("guess", guess);
        model.addAttribute("diceRoll", diceRoll);
        model.addAttribute("message", getMessage(guess, diceRoll));
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
            return "Oops! The dice rolled " + diceRoll + ". Better luck next time!";
        }
    }
}
