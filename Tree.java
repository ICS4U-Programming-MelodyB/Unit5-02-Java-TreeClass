/**
 * This program contains the tree,
 * class. Referenced code from video.
 *
 * @author  Melody Berhane
 * @version 1.0
 *
 * @since 2023-06-09.
 */

public class Tree {
    // Create fields.
    int numLeaves;
    int feetTall;
    String type;
    int age;

    // Create constructors.
    public Tree(int numOfLeaves, int heightTree, String treeType, int ageTree) {
        // Creating new tree objects.
        this.numLeaves = numOfLeaves;
        this.feetTall = heightTree;
        this.type = treeType;
        this.age = ageTree;
    }

    // Creating method for growing.
    public void grow() {
        this.feetTall = this.feetTall + 7;
        this.numLeaves = this.numLeaves + 1000;
        this.age = age + 1;
    }

    // Creating method for slowing growing.
    public void growSlow() {
        this.feetTall = this.feetTall + 5;
        this.numLeaves = this.numLeaves + 500;
    }

    // Creating method for specific growing.
    public void grow(int leaveNum, int feet) {
        this.numLeaves = numLeaves + leaveNum;
        this.feetTall = feetTall + feet;
        this.age = this.age + 1;
    }

    // Creating method for leaves lost.
    public void loseLeaves() {
        this.numLeaves = 0;
    }
}
