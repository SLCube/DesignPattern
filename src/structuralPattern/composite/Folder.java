package structuralPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{

    private String name;
    private List<FileSystem> included = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        included.add(fileSystem);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystem fileSystem : included) {
            total += fileSystem.getSize();
        }

        return total;
    }

    @Override
    public void remove() {
        for (FileSystem fileSystem : included) {
            fileSystem.remove();
        }
        System.out.println(name + "폴더 삭제");
    }
}
