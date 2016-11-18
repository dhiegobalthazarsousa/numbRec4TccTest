/*
 * This repository is a test of number recognition for use on the Graduation
 * Course project 
 * 
 */
package com.mycompany.number4tcc;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author dhiego.balthazar
 */
public class Main {
    public static void main(String[] args){
        
        
        File imagem = new File("testeCrop.png");
        Tesseract instance = new Tesseract();
        instance.setTessVariable("tessedit_char_whitelist", "0123456789.");
        try {
            Double result = Double.valueOf(instance.doOCR(imagem));
            System.out.printf("%.2f KN\n%.2f Kg", result,result*101.97);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
