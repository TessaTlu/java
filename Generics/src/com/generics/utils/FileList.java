package com.generics.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileList {

    public void printFiles(String path) {
        File f = new File(path);
        String[] fArray = null;
        if (f.exists() || f.isDirectory())
            fArray = f.list();
        else
            System.out.print("Папка не найдена");

        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));
        for (int i = 0; i < list.size(); i++) {
            if (i < 5)
                System.out.println(list.get(i));
        }
    }
}
