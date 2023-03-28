class DeleteFile {

    void deleteFile(){
        def file=new File('../newdir/test.txt')
        file.delete();
    }
}
