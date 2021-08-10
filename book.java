class book {
    int ISBN;
    String title;
    String author;
    int price;
    String Publisher;
    
    book(){

    }

    book(int isbn, String title, String author, int price, String publisher) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.Publisher = publisher;
    }

    public void display() {
        System.out.print(this.ISBN + "\t");
        System.out.print(this.title + "\t");
        System.out.print(this.author + "\t");
        System.out.print(this.price + "\t");
        System.out.print(this.Publisher + "\t");
        System.out.println();
    }

    public static void main(String []args){
        book books[] = new book[5];
        books[0] =new book(1,"abc","ben",117,"aaa");
        books[1] =new book(2,"xyz","john",123,"bbbb");
        books[2] =new book(3,"pqr","jos",135,"ccc");
        books[3] =new book(4,"stu","charly",148,"ddd");
        books[4] =new book(5,"aaa","kevin",150,"eee");

        int size = 5;  
        for(int i = 0; i<size-1; i++) { 
            for (int j = i+1; j<size; j++) { 
                if(books[i].title.compareTo(books[j].title)>0) {   
                    book temp = books[i];  
                    books[i] = books[j];  
                    books[j] = temp;  
                }  
            }  
        }  

        for(int i=0;i<5;i++){
            books[i].display();
        }
    }
}