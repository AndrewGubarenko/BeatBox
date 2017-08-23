/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import com.andriigubarenko.beatbox.BeatBoxGui;

/**
 *
 * @author Андрей
 */
public class MainTest {
    public static void main (String[] args) {
        BeatBoxGui beatBox = new BeatBoxGui();
        beatBox.startUp("Andrew");
        beatBox.setVisible(true);
      }
}
