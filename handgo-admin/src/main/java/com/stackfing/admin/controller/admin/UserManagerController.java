package com.stackfing.admin.controller.admin;

import com.stackfing.common.enums.ResultCode;
import com.stackfing.common.utils.HandgoResult;
import com.stackfing.common.utils.Result;
import com.stackfing.admin.entity.User;
import com.stackfing.admin.service.UserService;
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

	@GetMapping("/allUser")
	@ResponseBody
	public Result allUserListByPage(@RequestParam("page") Long page) {
		System.out.println(page);
//		return new JsonBodyUtil().send(0, "成功", 20, userService.selectAllUserByPage(page));
		Result result = new Result();
		result.setCode(ResultCode.SUCCESS);
		result.setData(userService.selectAllUserByPage(page));
		result.setCount(userService.getUserCount());
//		return HandgoResult.genSuccessResult(userService.selectAllUserByPage(page));
		return result;
	}

	@GetMapping("/allDelUser")
	@ResponseBody
	public Result deletedUserList(@RequestParam("page") Long page) {
		System.out.println(page);
		return HandgoResult.genSuccessResult(userService.selectAllDeletedUserByPage(page));
	}

	//通过id查询用户
	@GetMapping("/{uid}")
	@ResponseBody
	public Result getUserById(@PathVariable Long uid) {
		if (null == userService.selectUserById(uid)) {
			return HandgoResult.genFailResult("not found");
		}
		return HandgoResult.genSuccessResult(userService.selectUserById(uid));
	}

	@RequestMapping("/userList")
	@ResponseBody
	public List<User> getUserList() {
		List<User> list = userService.selectAllUser();
		for (User u : list) {
			System.out.println(u.toString());
		}
		return list;
	}

	@GetMapping("/add")
	public String addUser() {
		return "/admin/user-edit";
	}

	@PostMapping("/add")
	@ResponseBody
	public HandgoResult addUser(@RequestBody User user) {
		if (user != null) {
			System.out.println(user);
			userService.insertUser(user);
			return new HandgoResult().ok("ok").Build(200);
		}
		return new HandgoResult().faild("输入信息错误").Build(403);
	}

	@ResponseBody
	@PostMapping("/del/{uid}")
	public Result delUser(@PathVariable Long uid) {
		if (userService.deleteUserById(uid) == 1)
			return HandgoResult.genSuccessResult();
		return HandgoResult.genFailResult("FAILD");
	}

	@GetMapping("/edit")
	public String editUser() {
		return "admin/user-edit";
	}

	@PostMapping("/update")
	@ResponseBody
	public HandgoResult updateUser(@RequestBody User user) {
		System.out.println(user);
		if ( 1 == userService.updateUserById(user)){
			return new HandgoResult().ok("ok");
		}
		return new HandgoResult().faild("faild");
	}
}
