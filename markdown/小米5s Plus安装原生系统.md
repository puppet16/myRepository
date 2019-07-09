# 小米5s Plus安装原生系统

手机型号：***MI 5s Plus***&emsp; &emsp; codeName：**natrium**

## 第一步：先解锁手机 

1. 登录网站[http://www.miui.com/unlock/index.html](http://www.miui.com/unlock/index.html)，点击立即解锁。

2. 提交申请成功后，等待审核通过。(一般申请后马上通过)

3. 审核通过后即获解锁资格，然后点击解决工具下载。如图：

   ![成功获取解锁资格](https://raw.githubusercontent.com/puppet16/puppet16.github.io/master/picture/blogPic/shua1.png)

4. 将下载好的工具压缩包解压，并点击miflash_unlock.exe运行解锁工具。

5. 然后设置手机进入Bootloader模式（关机后，同时按住开机键和音量下键）。

6. 通过USB连接手机，点击 “解锁”按钮，过程中需要验证小米账号(保证手机登录了有解锁资格的账号)

7. 解锁成功后，点击重启手机。如图：![解锁成功](https://raw.githubusercontent.com/puppet16/puppet16.github.io/master/picture/blogPic/shua2.png)

   *详细解锁教程可以参考[http://www.shuajizhijia.net/news/18550.html](http://www.shuajizhijia.net/news/18550.html)*

## 第二步：刷一个第三方recovery

1. 下载Recovery工具包，链接：[https://pan.baidu.com/s/1wARkj7nArWUlzrI7iLKPBA](https://pan.baidu.com/s/1wARkj7nArWUlzrI7iLKPBA) 密码：**ovkz**

2. 手机要进入FastBoot模式，进入的方法：在手机关机状态下，按住音量键-和电源键

3. 保证手机正常连接电脑

4. 然后把上面下载下来的recovery工具包在电脑上进行解压，然后在文件夹里找到【recovery-twrp一键刷入工具.bat】文件直接双击打开运行。

5. 过几秒安装完成后会自动打开recovery界面。

6. 这个版本是3.2.3，可以自动解密data分区

   *详细刷recovery教程可以参考[http://bbs.xiaomi.cn/t-25351609-2-o1#comment_top](http://bbs.xiaomi.cn/t-25351609-2-o1#comment_top)*

## 第三步： 获取Root权限

### 方法一、刷root包

1. 下载root包，链接：[https://pan.baidu.com/s/13PogRZX2ZUivdb_wOjuzug](https://pan.baidu.com/s/13PogRZX2ZUivdb_wOjuzug) 密码：**rl7v**

2. 将下载下来的压缩包解压，并将Root-Supersu_Pro_2.74.zip放到手机根目录下

3. 进入Recovery界面，点击安装，在根目录下选择压缩包。

4. 安装完成后，点重新启动。

### 方法二、 MIUI系统中获取

   1. 安全中心-->应用管理-->权限-->Root权限管理
   2. 点击获取root权限。

   

## 第四步： 获取ROM包

AospExtended：[https://downloads.aospextended.com/](https://downloads.aospextended.com/)

Lineageos：[https://download.lineageos.org/](https://download.lineageos.org/)

## 第五步： 安装ROM包

1. 将下好的ROM包放到手机根目录下
2. 打开手机的Recovery界面，点击安装，选择ROM包。
3. 手机卡在开机界面时，先进入Recovery界面再格式化data即可。

## 第六步：获取Root权限

1. Lineageos的Root包地址：[https://www.lineageosrom.com/2017/01/download-supersuzp-and-su-removalzip.html](https://www.lineageosrom.com/2017/01/download-supersuzp-and-su-removalzip.html)
2. 下载好对就CPU及系统版本的Root包后，将压缩包放到手机根目录下
3. 打开手机的Recovery界面，选择安装Root包。

## 遇到问题

   1. WIFI显示叉号，提示无法联网，但是可以上网

      解决方法：

      Android 7.0之前版本的系统，执行以下命令：

      `adb shell "settings put global captive_portal_server captive.lineageos.org.cn"`

      Android 7.0之后的版本需要执行下面的两条命令：

      `adb shell "settings put global captive_portal_http_url http://captive.lineageos.org.cn/generate_204";`

      `adb shell "settings put global captive_portal_https_url https://captive.lineageos.org.cn/generate_204"`

      参考网址：[https://www.lineageos.org.cn/thread-118-1-1.html](https://www.lineageos.org.cn/thread-118-1-1.html)

   2. ***一定要科学上网，否则网速会让你绝望***
