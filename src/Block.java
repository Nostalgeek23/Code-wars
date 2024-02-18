public class Block {

//    Write a class Block that creates a block (Duh..)
//
//    Requirements
//    The constructor should take an array as an argument, this will contain 3 integers of the form
//    [width, length, height] from which the Block should be created.
//
//    Define these methods:
//
//    `getWidth()` return the width of the `Block`
//
//            `getLength()` return the length of the `Block`
//
//            `getHeight()` return the height of the `Block`
//
//            `getVolume()` return the volume of the `Block`
//
//            `getSurfaceArea()` return the surface area of the `Block`


    int width;
    int length;
    int height;

    Block(int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    int getWidth(){
        return width;
    }
    int getLength() {
        return length;
    }

    int getHeight(){
        return height;
    }

    int getVolume(){
        int volume = width * length * height;
        return volume;
    }

    int getSurfaceArea (){
        int surface = 2 * (width * length) + 2 * (width * height) + 2 * (length * height);
        return surface;
    }






}
