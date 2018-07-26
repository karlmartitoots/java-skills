import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1L;
    private int modulo = (int)Math.pow(10,9)+7;
    public int getResult() {
        return (int)result;
    }

    public void visitNode(TreeNode node) {
        if(node.getColor().equals(Color.RED)){
            result *= node.getValue();
            result %= modulo;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.RED)){
            result *= leaf.getValue();
            result %= modulo;
        }
    }
}