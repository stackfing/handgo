package com.stackfing.handgo.controller.admin;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.pojo.Result;
import com.stackfing.handgo.pojo.ResultGenerator;
import com.stackfing.handgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/users")
public class UserManagerController {

	@Autowired
	private UserService userService;


	@GetMapping("")
	public String getAllUsers() {

		return "redirect:/admin";
	}

//	@GetMapping("{uid}")
//	public String editUser(@PathVariable Long uid, ModelMap modelMap) {
//		User user = userService.selectUserById(uid);
//		modelMap.put("userDetail", user);
//		return "/admin/user-edit";
//	}

	@GetMapping("/all")
	@ResponseBody
	public Result findall(@RequestParam("page") Long page) {
		System.out.println(page);
//		return new JsonBodyUtil().send(0, "成功", 20, userService.selectAllUserByPage(page));
		return ResultGenerator.genSuccessResult(userService.selectAllUserByPage(page));
	}

	//通过id查询用户
	@GetMapping("{uid}")
	@ResponseBody
	public User getUserById(@PathVariable Long uid) {
		return userService.selectUserById(uid);
	}

	@RequestMapping("userList")
	@ResponseBody
	public List<User> getUserList() {
		List<User> list = userService.selectAllUser();
		for (User u : list) {
			System.out.println(u.toString());
		}
		return list;
	}


	@GetMapping("add")
	public String addUser() {
		return "/admin/user-edit";
	}

	@ResponseBody
	@GetMapping("del/{uid}")
	public String delUser(@PathVariable Long uid) {
		userService.deleteUserById(uid);
		return "删除成功";
	}
}
