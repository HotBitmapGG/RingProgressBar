# RingProgressBar

一个简单实现的自定义圆环进度条,可使用于文件的上传下载图片加载等地方.


## 截图
![](https://github.com/HotBitmapGG/StudyProject/blob/studyRank/pic/01.jpg?raw=true)

# 导入项目
 Step 1. Add the JitPack repository to your build file
 Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}



Step 2. Add the dependency

	dependencies {
	        compile 'com.github.HotBitmapGG:RingProgressBar:V1.0'
	}

## 使用说明

* 自定义属性介绍

    <declare-styleable name="RingProgressBar">
        <attr name="ringColor" format="color" />
        <attr name="ringProgressColor" format="color" />
        <attr name="ringWidth" format="dimension"></attr>
        <attr name="textColor" format="color" />
        <attr name="textSize" format="dimension" />
        <attr name="max" format="integer"></attr>
        <attr name="textIsShow" format="boolean"></attr>
        <attr name="style">
            <enum name="STROKE" value="0"></enum>
            <enum name="FILL" value="1"></enum>
        </attr>
    </declare-styleable>

## 用法

* 1.在XML中

       <io.netopen.hotbitmapgg.library.view.RingProgressBar
           android:id="@+id/progress_bar"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:layout_centerInParent="true"
           app:max="100"
           app:ringColor="@color/colorPrimary"
           app:ringProgressColor="@color/colorPrimaryDark"
           app:ringWidth="4dp"
           app:style="STROKE"
           app:textColor="@color/colorPrimary"
           app:textIsShow="true"
           app:textSize="16sp" />

* 2.代码中

  mRingProgressBar = (RingProgressBar) findViewById(R.id.progress_bar);

  //设置进度条的进度值
  mRingProgressBar.setProgress(progress);
  mRingProgressBar.setOnProgressListener(new RingProgressBar.OnProgressListener()
  {

    @Override
     public void progressToComplete()
     {
         // 进度达到最大值时回调 默认max进度值为100
         Toast.makeText(MainActivity.this, "完成", Toast.LENGTH_SHORT).show();
     }
  });

  ## Other
  * 知了日报客户端: https://github.com/HotBitmapGG/RxZhiHu
  * 高仿BiliBili客户端: https://github.com/HotBitmapGG/OhMyBiliBili
  * Gank.IO客户端: https://github.com/HotBitmapGG/StudyProject
  * 妹子福利App: https://github.com/HotBitmapGG/MoeQuest

  ## License

 Copyright 2016 HotBitmapGG

 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.




