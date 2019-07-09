# AppbarLayout 自动滚动到指定位置

AppbarLayout有两种状态：折叠状态和展开状态。
可以通过 **setExpanded (boolean expanded)** 方法设置状态。  
**addOnOffsetChangedListener**当AppbarLayout 的偏移发生改变的时候回调，也就是子View滑动。

可以通过以下方法设置自动滚动到指定位置：  
```
    CoordinatorLayout.Behavior behavior1 = ((CoordinatorLayout.LayoutParams) mAppbarLayout.getLayoutParams()).getBehavior();
    if (behavior1 != null) {
        behavior1.onNestedPreScroll(mCoorDinator, mAppbarLayout, mRvRoot, 0, ShortVideoUtils.dp2px(185), new int[]{0, 0}, TYPE_NON_TOUCH);
    }
```  
<font color=#DC143C size=4 >但是该段代码只能放到**addOnOffsetChangedListener**的监听中执行，否则获取的behavior为空。</font>