/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5strukdat;

/**
 *
 * @author root
 */
public class Main {
    public static void main(String[] args){
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\npreOrder  : ");
        pohon.preOrder(pohon.root);
        System.out.println("\ninOrder   : ");
        pohon.inOrder(pohon.root);
        System.out.println("\npostOrder : ");
        pohon.postOrder(pohon.root);

    }

}
