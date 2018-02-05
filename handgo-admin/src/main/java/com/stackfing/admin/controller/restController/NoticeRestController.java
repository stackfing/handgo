package com.stackfing.admin.controller.restController;

import com.stackfing.common.utils.Result;
import com.stackfing.common.vo.NoticeVo;
import com.stackfing.pojo.Notice;
import com.stackfing.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:35 18-1-26
 */

@RestController
@RequestMapping("/v1/notice")
public class NoticeRestController {

	@Autowired
	private NoticeService noticeService;

	@GetMapping("")
	public Result getList(@RequestParam(required = false) Integer page
			, @RequestParam(required = false) Integer limit) {
		if (null == page || null == limit) {
			//不分页
			return Result.success(noticeService.getNoticeList());
		}
		return Result.success(noticeService.getNoticeList(page, limit));
	}

	@PutMapping("/{id}")
	public Result update(@PathVariable Integer id, @RequestBody Notice notice) {
		return Result.success(noticeService.save(id, notice));
	}

	@PostMapping("")
	public Result save(@RequestBody Notice notice) {
		return Result.success(noticeService.save(notice));
	}

	@DeleteMapping("{id}")
	public Result delete(@PathVariable Integer id) {
		//TODO 删除操作
		return Result.success(noticeService.delete(id));
	}
}
