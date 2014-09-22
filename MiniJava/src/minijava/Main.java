/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijava;

import java.io.File;

/**
 *
 * @author leeboy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String path = "/home/leeboy/NetBeansProjects/Compiler-Project/MiniJava/src/minijava/scanner/minijava.flex";
        gerarLexer(path);
    }
    
    public static void gerarLexer(String path)
    {
        File file = new File(path);
        jflex.Main.generate(file);
    }
    
}
