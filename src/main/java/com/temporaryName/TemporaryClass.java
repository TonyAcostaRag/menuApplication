package com.temporaryName;

public class TemporaryClass {
    public void printTemporary() {

        StringBuilder a = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            if(i == 0) {
                a.append("tea");
                System.out.println(a);
            } else if (i == 1) {
                a.append("s");
                System.out.println(a);
            } else if (i == 2) {
                a.insert(3, 'm');
                System.out.println(a);
            } else if (i == 3) {
                a.delete(2, 4);
                System.out.println(a);
            } else if (i == 4) {
                a.reverse();
                System.out.println(a);
            } else if (i == 5) {
                System.out.println(a.length());
                System.out.println(a.capacity());
            } else if (i == 6) {
                a.insert(3, 's');
                System.out.println(a);
            }
        }

    }
}
