参考资料

http://icejoywoo.github.io/2018/07/25/spark-jni.html

Demo

https://github.com/PeterHo/jniDemo



# 生成头文件

将 "C:\Program Files\Java\jdk1.8.0_144\bin\" 添加到环境变量

IDEA 中 Alt+F12 呼出控制台

```bash
cd src
javah com.zzjz.Base64
```

生成C++头文件 com_zzjz_Base64.h



# 编译dll/so

新建C++工程

实现头文件中定义的函数

编译, 将编译好的dll/so文件放到 resource/lib/base64.dll



# 运行

这个时候可以运行 com.zzjz.Base64.main 查看效果



# 打包

新建Artifacts -> empty

添加相应的 Module Output

Build Artifacts



# 手动打包

```bash
# 编译java文件
javac ./com/zzjz/Base64.java

# 打包
jar cf base64.jar ./com/zzjz/*.class

# 包内添加文件
jar uf base64.jar -C ../resource ./lib/

# 运行
java -classpath base64.jar com.zzjz.Base64
```
