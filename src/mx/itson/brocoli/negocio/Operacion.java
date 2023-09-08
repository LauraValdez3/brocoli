/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

public class Operacion {
    
    /**
     * Separa una cadena de texto a partir de la expresión guión medio.
     * @param valor Cadena de texto que será separada a partir de la expresión dada.
     * @return Array de string donde cada posición representa una división de la cadena de texto.
     */
    
    public String [] separar (String valor){
        String [] elementos = valor.split("-");
        return elementos;
    }
    
}
