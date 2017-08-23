/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriigubarenko.beatbox;

/**
 *
 * @author Andrii Gubarenko
 */
public class Main {
    public static void main (String[] args) {
        BeatBoxGui beatBox = new BeatBoxGui();
        beatBox.startUp(args[0]);
        beatBox.setVisible(true);
      }
}
