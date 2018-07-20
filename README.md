

参考：
[使用CardView来设置阴影效果及点击效果](https://www.jianshu.com/p/9dd4db80d37a)
[Toolbar设置详解----掉坑总结](https://www.jianshu.com/p/7b5c99e1cfa3)
[Toolbar的使用](https://github.com/wangli135/BlogDemo/blob/master/toolbardemo/src/main/java/com/xks/toolbardemo/MainActivity.java)
[shuaijia/MaterialDesignProject](https://github.com/shuaijia/MaterialDesignProject/blob/master/app/build.gradle)
[Material Design整理系列](https://blog.csdn.net/jiashuai94/article/category/7141898)
[一文彻底搞懂 Design 设计的 CoordinatorLayout 和 AppbarLayout 联动](http://www.apkbus.com/blog-898535-68661.html)
[](https://github.com/Mike-bel/MDStudySamples/blob/master/app/src/main/java/com/yifeng/mdstudysamples/activity/FabActivity.java)

cardview
========

导入：


```
 compile 'com.android.support:cardview-v7:25.3.1'（CardView版本号与项目里面V7版本号相同即可）
```


为何使用CardView 


CardView是继承自FramLayout的一个布局控件，官网里对CardView的注释为:

A FrameLayout with a rounded corner background and shadow.
(CardView为带圆角和阴影的FramLayout)

以往，我们需要自定义Shape来实现圆角和阴影效果；

现在，这些效果集成到了CardView的属性里。同时，

CardView应该被使用在显示层次性的内容时，

在显示列表或网格时更应该被选择，因为这些边缘可以使得用户更容易去区分这些内容。


```
public class CardView extends FrameLayout {...}
```





palette
====


CoordinatorLayout
====

```
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent {

```


```
public class AppBarLayout extends LinearLayout {

```

```
public class CollapsingToolbarLayout extends FrameLayout {

```

```
public class Toolbar extends ViewGroup {

```

```
public class TabLayout extends HorizontalScrollView {

```



1、 CoordinatorLayout 是什么

我们不妨看看官方文档的描述：　　　

CoordinatorLayout 是一个 “加强版” FrameLayout， 它主要有两个用途：

1) 用作应用的顶层布局管理器，也就是作为用户界面中所有 UI 控件的容器;

2) 用作相互之间具有特定交互行为的 UI 控件的容器，通过为 CoordinatorLayout 的子 View 指定 Behavior， 

就可以实现它们之间的交互行为。 Behavior 可以用来实现一系列的交互行为和布局变化，

比如说侧滑菜单、可滑动删除的 UI 元素，以及跟随着其他 UI 控件移动的按钮等。

其实总结出来就是 CoordinatorLayout 是一个布局管理器，相当于一个增强版的 FrameLayout，

但是它神奇在于可以实现它的子 View 之间的交互行为。




























