// Generated by view binder compiler. Do not edit!
package com.example.obd_kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.obd_kotlin.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final LinearLayout BackButt;

  @NonNull
  public final Toolbar BottomToolBar;

  @NonNull
  public final LinearLayout NextButt;

  @NonNull
  public final Toolbar TopToolBar;

  @NonNull
  public final AppBarLayout appBarLayoutBottom;

  @NonNull
  public final AppBarLayout appBarLayoutTop;

  @NonNull
  public final RelativeLayout bottomBar;

  @NonNull
  public final CoordinatorLayout main;

  @NonNull
  public final TextView nextLabel;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final RelativeLayout topBar;

  @NonNull
  public final ImageView topLogo;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView, @NonNull LinearLayout BackButt,
      @NonNull Toolbar BottomToolBar, @NonNull LinearLayout NextButt, @NonNull Toolbar TopToolBar,
      @NonNull AppBarLayout appBarLayoutBottom, @NonNull AppBarLayout appBarLayoutTop,
      @NonNull RelativeLayout bottomBar, @NonNull CoordinatorLayout main,
      @NonNull TextView nextLabel, @NonNull RelativeLayout relativeLayout,
      @NonNull RelativeLayout topBar, @NonNull ImageView topLogo) {
    this.rootView = rootView;
    this.BackButt = BackButt;
    this.BottomToolBar = BottomToolBar;
    this.NextButt = NextButt;
    this.TopToolBar = TopToolBar;
    this.appBarLayoutBottom = appBarLayoutBottom;
    this.appBarLayoutTop = appBarLayoutTop;
    this.bottomBar = bottomBar;
    this.main = main;
    this.nextLabel = nextLabel;
    this.relativeLayout = relativeLayout;
    this.topBar = topBar;
    this.topLogo = topLogo;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Back_butt;
      LinearLayout BackButt = ViewBindings.findChildViewById(rootView, id);
      if (BackButt == null) {
        break missingId;
      }

      id = R.id.BottomToolBar;
      Toolbar BottomToolBar = ViewBindings.findChildViewById(rootView, id);
      if (BottomToolBar == null) {
        break missingId;
      }

      id = R.id.Next_butt;
      LinearLayout NextButt = ViewBindings.findChildViewById(rootView, id);
      if (NextButt == null) {
        break missingId;
      }

      id = R.id.TopToolBar;
      Toolbar TopToolBar = ViewBindings.findChildViewById(rootView, id);
      if (TopToolBar == null) {
        break missingId;
      }

      id = R.id.appBarLayout_bottom;
      AppBarLayout appBarLayoutBottom = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayoutBottom == null) {
        break missingId;
      }

      id = R.id.appBarLayout_top;
      AppBarLayout appBarLayoutTop = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayoutTop == null) {
        break missingId;
      }

      id = R.id.bottomBar;
      RelativeLayout bottomBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomBar == null) {
        break missingId;
      }

      CoordinatorLayout main = (CoordinatorLayout) rootView;

      id = R.id.next_label;
      TextView nextLabel = ViewBindings.findChildViewById(rootView, id);
      if (nextLabel == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      RelativeLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.topBar;
      RelativeLayout topBar = ViewBindings.findChildViewById(rootView, id);
      if (topBar == null) {
        break missingId;
      }

      id = R.id.top_logo;
      ImageView topLogo = ViewBindings.findChildViewById(rootView, id);
      if (topLogo == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, BackButt, BottomToolBar,
          NextButt, TopToolBar, appBarLayoutBottom, appBarLayoutTop, bottomBar, main, nextLabel,
          relativeLayout, topBar, topLogo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
