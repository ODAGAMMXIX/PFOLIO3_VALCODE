package com.ExampleValcode.valcode.rest;

import com.ExampleValcode.valcode.helper.CsvFonteHelper;
import com.ExampleValcode.valcode.message.ResponseMessage;
import com.ExampleValcode.valcode.service.CsvFonteService;
import com.ExampleValcode.valcode.service.CsvModalidadeService;
import com.ExampleValcode.valcode.util.CsvUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/csv")
public class CsvController {
    private final CsvFonteService fileService;


    private final CsvUtils utils;

    private final CsvModalidadeService modalidadeService;

    @Autowired
    public CsvController(
            CsvFonteService fileService,
            CsvModalidadeService modalidadeService,
            CsvUtils utils
    ){
        this.modalidadeService = modalidadeService;
        this.fileService = fileService;
        this.utils = utils;
    }


    @PostMapping("/upload/{proccess}")
    public ResponseEntity<ResponseMessage> uploadFile(
            @RequestParam("file") MultipartFile file,
            @PathVariable String proccess
    ){
        String message = "";
        if (CsvUtils.hasCSVFormat(file)){
            try{
                switch (proccess){
                    case "fonte":
                        fileService.save(file);
                        break;
                    case "modalidade":
                        modalidadeService.save(file);
                        break;
                }

                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e){
                message = "Could not upload the file: " + file.getOriginalFilename() + "!" + e.getMessage();
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }
        message = "Please upload a csv file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }


}
