package com.example.taco.controller;

import com.example.taco.dao.TacoRepository;
import com.example.taco.model.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;


@Slf4j // 会在当前类中自动生成 static final org.slf4j.Logger log
@RestController // 识别类为控制器
// consumes： 指定处理请求的提交内容类型（Content-Type）
// produces:    指定返回的内容类型
@RequestMapping(path="/taco", produces = "application/json") // 类映射路径前缀
@CrossOrigin(origins = "*") // 允许跨域请求
@Validated // 为类添加参数验证，用于path参数验证
public class TacoController {

    private final TacoRepository tacoRepository;

    @Autowired
    public TacoController(TacoRepository tacoRepository) {
        this.tacoRepository = tacoRepository;
    }

    // 映射get请求，不加路径则映射 Get /design，也可以用 RequestMapping(method=RequestMethod.GET)
    // {id} 占位符，通过PathVariable获取值
    @GetMapping("/{id}")
    public Taco readByID(@PathVariable("id") @Min(1) Long id) {
        return tacoRepository.findOne(id);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED) // 设置回复状态码，默认200
    // @Valid 增加参数校验
    public Taco create(@Valid @RequestBody Taco taco) {
        tacoRepository.save(taco);
        return taco;
    }

}
