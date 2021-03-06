package chapter4.varianta.task19;

import java.util.ArrayList;
import java.util.List;


public class PhotoAlbum {
    private final int pages;
    private final List<Page> pageList = new ArrayList<>();

    public PhotoAlbum(int pages) {
        this.pages = pages;
    }

    void addPhoto(Photo somePhoto) {
        if (getPageList().size() == pages && getPageList().get(pageList.size()-1).isFullPage()) {
            throw new UnsupportedOperationException("Can't add new Photo, Album is Full");
        } else if (getPageList().isEmpty() || getPageList().get(pageList.size()-1).isFullPage()) {
            getPageList().add(new Page());
        }
        getPageList().get(pageList.size()-1).getPhotoList().add(somePhoto);
    }

    int quantityPhoto() {
        int quantity = 0;
        for (Page page : pageList) {
            quantity += page.getPhotoList().size();
        }
        return quantity;
    }

//
//    public int getLastElementIndex() {
//        int index;
//        if (!getPageList().isEmpty())
//            index = getPageList().size() - 1;
//        else
//            index = 0;
//        return index;
//    }

    public List<Page> getPageList() {
        return pageList;
    }

}
