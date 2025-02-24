public class Box{
    private int _length;
    private int _width;
    private int _height;

    public void set_length(int length) {
        this._length = length;
    }

    public void set_width(int width) {
        this._width = width;
    }

    public void set_height(int _height) {
        this._height = _height;
    }

    public int get_length() {
        return this._length;
    }

    public int get_width() {
        return this._width;
    }

    public int get_height() {
        return this._height;
    }

    public int calculate_area(){
        return this.get_length() * this.get_width();
    }

    public int calculate_volume(){
        return this.get_height() * this.get_width() * this.get_length();
    }
}