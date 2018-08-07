import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

class FancyVisitor extends TreeVis {
    private int sum1 = 0;
    private int sum2 = 0;
    public int getResult() {
        return Math.abs(sum1-sum2);
    }

    public void visitNode(TreeNode node) {
    	if(node.getDepth()%2 == 0){
            sum1 += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
    	if(leaf.getColor().equals(Color.GREEN)){
            sum2 += leaf.getValue();
        }
    }
}

