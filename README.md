

参考：
[Toolbar的简单使用](https://blog.csdn.net/monalisatearr/article/details/78415585)

[使用CardView来设置阴影效果及点击效果](https://www.jianshu.com/p/9dd4db80d37a)

[Android进阶---一个项目，一个Toolbar](https://www.jianshu.com/p/65cd2d4ad99a)

[Toolbar设置详解----掉坑总结](https://www.jianshu.com/p/7b5c99e1cfa3)

[Toolbar的使用](https://github.com/wangli135/BlogDemo/blob/master/toolbardemo/src/main/java/com/xks/toolbardemo/MainActivity.java)

[shuaijia/MaterialDesignProject](https://github.com/shuaijia/MaterialDesignProject/blob/master/app/build.gradle)

[Material Design整理系列](https://blog.csdn.net/jiashuai94/article/category/7141898)

[一文彻底搞懂 Design 设计的 CoordinatorLayout 和 AppbarLayout 联动](http://www.apkbus.com/blog-898535-68661.html)

[Mike-bel/MDStudySamples](https://github.com/Mike-bel/MDStudySamples/blob/master/app/src/main/java/com/yifeng/mdstudysamples/activity/FabActivity.java)

[coordinatorLayout使用详解及注意事项,看完这篇完全可以开发5.0的高级特效了](https://blog.csdn.net/qq_31340657/article/details/51918773)

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

```
public class NestedScrollView extends FrameLayout implements NestedScrollingParent,
        NestedScrollingChild, ScrollingView {
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



AppBarLayout
===

AppBarLayout是一个垂直的LinearLayout，实现了Material Design中app bar的scrolling gestures特性。

AppBarLayout的子View应该声明想要具有的“滚动行为”，这可以通过layout_scrollFlags属性或是setScrollFlags()方法来指定。

AppBarLayout只有作为CoordinatorLayout的直接子View时才能正常工作，

为了让AppBarLayout能够知道何时滚动其子View，我们还应该在CoordinatorLayout布局中提供一个可滚动View，

我们称之为scrolling view。scrolling view和AppBarLayout之间的关联，

通过将scrolling view的Behavior设为AppBarLayout.ScrollingViewBehavior来建立。

即：AppBarLayout主要用来实现这样的功能：当位于同一父容器中的可滚动View发生滚动时，

AppBarLayout会根据子View声明的滚动行为来对其子View进行相应的滚动。




android:fitsSystemWindows="true"

是一个boolean值的内部属性，让view可以根据系统窗口(如status bar)来调整自己的布局，如果值为true,就会调整view的paingding属性来给system windows留出空间...

用于实现状态栏，即 沉浸式状态栏！

app:popupTheme

这个属性就是用来自定义我们弹出的菜单的样式，在之前的Actionbar的溢出菜单，

我们是不能自定义他的样式的，只能根据你的theme来选择黑白两种，不能自己定义，现在我们可以定义弹出菜单的样式。



CoordinatorLayout
===

app:layout_scrollFlags （子布局设置是否可滑动）

android:layout_gravity 属性控制组件在布局中的位置

app:layout_behavior="@string/appbar_scrolling_view_behavior" 通知布局中包含滑动组件！

 

子布局通过app:layout_scrollFlags确定是否可滑动.

给需要滑动的组件设置 app:layout_scrollFlags="scroll|enterAlways" 属性。 

设置的layout_scrollFlags有如下几种选项： 

scroll: 所有想滚动出屏幕的view都需要设置这个flag- 没有设置这个flag的view将被固定在屏幕顶部。

enterAlways: 

这个flag让任意向下的滚动都会导致该view变为可见，启用快速“返回模式”。 

enterAlwaysCollapsed: 

当你的视图已经设置minHeight属性又使用此标志时，你的视图只能已最小高度进入，只有当滚动视图到达顶部时才扩大到完整高度。 

exitUntilCollapsed:
 
滚动退出屏幕，最后折叠在顶端。

CollapsingToolbarLayout
===

app:collapsedTitleGravity 

指定折叠状态的标题如何放置，可选值:top、bottom等

app:collapsedTitleTextAppearance="@style/TextAppearance.CollapsedTitle"

指定折叠状态标题文字的样貌
app:expandedTitleTextAppearance="@style/TextAppearance.ExpandedTitle"

指定展开状态标题文字的样貌

app:contentScrim="?attr/colorPrimaryDark"

指定CollapsingToolbarLayout完全被滚出到屏幕外时的ColorDrawable
app:expandedTitleGravity  展开状态的标题如何放置

app:titleEnabled指定是否显示标题文本

app:toolbarId指定与之关联的ToolBar，如果未指定则默认使用第一个被发现的ToolBar子View

app:expandedTitleMarginStart="10dp"

app:expandedTitleMargin

app:expandedTitleMarginBottom

app:expandedTitleMarginEnd

展开状态改变标题文字的位置，通过margin设置

app:layout_collapseParallaxMultiplier="0.7"

设置视差的系数，介于0.0-1.0之间。

app:layout_collapseMode="pin"（子布局设置折叠模式）
有两种“pin”：固定模式，在折叠的时候最后固定在顶端；“parallax”：视差模式，在折叠的时候会有个视差折叠的效果。

 

CollapsingToolbarLayout 主要是提供一个可折叠的Toolbar容器，
对容器中的不同View设置layout_collapseMode折叠模式，来达到不同的折叠效果。

 
ConstraintLayout : 约束布局
====

[ConstraintLayout 完全解析 快来优化你的布局吧](https://blog.csdn.net/lmj623565791/article/details/78011599)

ConstraintLayout属于Android Studio 2.2的新特性,可以有效地解决布局嵌套过多的问题










