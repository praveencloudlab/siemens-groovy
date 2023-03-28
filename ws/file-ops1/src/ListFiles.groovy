class ListFiles {
    void listFiles(){
        def dir=new File('..')
        def files=dir.listFiles();
       // println(files)
        files.each {file->println(file)}

    }
}
