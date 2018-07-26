import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;
    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
      	sum += leaf.getValue();
    }
}