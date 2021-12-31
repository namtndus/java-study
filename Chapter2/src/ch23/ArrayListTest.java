package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        //원래는 왼쪽의 제너릭에도 Book을 명시해야 하지만 자동적으로 Book으로 들어가게 바뀜
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산백1","조정래"));
        library.add(new Book("태백산백2","조정래"));
        library.add(new Book("태백산백3","조정래"));
        library.add(new Book("태백산백4","조정래"));
        library.add(new Book("태백산백5","조정래"));

        for(int i =0; i<library.size(); i++){
            library.get(i).showInfo();
        }
    }

}
