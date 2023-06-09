/**
 * This program contains the main,
 * class. Referenced code from video.
 *
 * @author  Melody Berhane
 * @version 1.0
 *
 * @since 2023-06-08.
 */

/**
 * This is the main method.
 *
* @param args Unused.
*/
public class Main {
    // Create tree instances.
    public static void main(String[] args) {
        final Tree treeOne = new Tree(24500, 85,
                "Weeping Willow", 20);

        // Display tree type using methods.
        System.out.print("This tree has " + treeOne.numLeaves);
        System.out.print(" leaves and");
        System.out.println(" the tree size is " + treeOne.feetTall);

        // Call method & display.
        treeOne.grow();
        System.out.print("The new tree has " + treeOne.numLeaves);
        System.out.print(" leave and");
        System.out.println(" the tree size is " + treeOne.feetTall);

        // Call method & display.
        treeOne.grow(75, 90);
        System.out.print("The new tree has " + treeOne.numLeaves);
        System.out.print(" leave and");
        System.out.println(" the tree size is " + treeOne.feetTall);

        // Call method & display.
        treeOne.growSlow();
        System.out.print("The new tree has " + treeOne.numLeaves);
        System.out.print(" leave and");
        System.out.println(" the tree size is " + treeOne.feetTall);

        // Call method & display.
        treeOne.loseLeaves();
        System.out.print("Oh no! Tree now has " + treeOne.numLeaves);
        System.out.println(" leaves.");
    }
}
