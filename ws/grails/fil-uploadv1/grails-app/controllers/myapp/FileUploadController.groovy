package myapp

class FileUploadController {

    def index() { }

    def upload(FileUploadCommand command) {
        if (command.file) {
            // Save the file to the desired location
            def saveFile = new File("/Users/praveen/files/${command.file.originalFilename}")
            command.file.transferTo(saveFile)

            flash.message = "File uploaded successfully"
        } else {
            flash.message = "Please select a file to upload"
        }
        redirect(action: 'index')
    }

}
