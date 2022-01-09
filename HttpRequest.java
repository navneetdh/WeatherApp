<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="25dp"
    android:background="@drawable/bcwf">

    <RelativeLayout android:id="@+id/mainContainer"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:visibility="visible">
        <LinearLayout android:id="@+id/addressContainer"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:gravity="center"
            >
            <TextView android:id="@+id/address"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textSize="30dp"
                android:textColor="#000000"
                android:textStyle="italic"
                />
            <TextView android:id="@+id/updated_at"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:paddingTop="20dp"
                android:textSize="20dp"
                android:textStyle="bold"
                android:textColor="#000000"
               />
        </LinearLayout>


        <LinearLayout android:id="@+id/overviewContainer"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_centerInParent="true">

            <TextView android:id="@+id/status"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textSize="18dp"
                android:textStyle="bold"
                android:layout_gravity="center"
                android:textColor="#000000"
           />
            <TextView android:id="@+id/temp"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textSize="90dp"
                android:layout_gravity="center"
                android:textColor="#000000"
               />

            <LinearLayout android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:gravity="center">
                <TextView android:id="@+id/temp_min"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:textStyle="bold"
                    android:textColor="#000000"
                />
                <Space android:layout_width="50dp"
                    android:layout_height="wrap_content"/>

                <TextView android:id="@+id/temp_max"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:textStyle="bold"
                    android:textColor="#000000"
                  />
            </LinearLayout>

        </LinearLayout>


        <LinearLayout android:id="@+id/detailsContainer"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_alignParentBottom="true">
            <LinearLayout android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:weightSum="3">
                <LinearLayout android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="#3CF1EBF1">

                    <Space android:layout_width="wrap_content"
                        android:layout_height="5dp"/>
                    <TextView android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="12dp"
android:text="Sunrise"
                        android:id="@+id/sund"
                        android:textStyle="bold"
                        android:textColor="#000000"/>
                    <TextView android:id="@+id/sunrise"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="14dp"
                        android:textStyle="bold"
                        android:textColor="#000000"
                        />
                </LinearLayout>
                <Space android:layout_width="10dp"
                    android:layout_height="wrap_content"/>
                <LinearLayout android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="#3CF1EBF1"
                    android:id="@+id/sunsd">

                    <Space android:layout_width="wrap_content"
                        android:layout_height="5dp"/>
                    <TextView android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="12dp"
                        android:text="Sunset"
                        android:textStyle="bold"
                        android:textColor="#000000"/>
                    <TextView android:id="@+id/sunset"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="14dp"
                        android:textStyle="bold"
                        android:textColor="#000000"
                 />
                </LinearLayout>
                <Space android:layout_width="10dp"
                    android:layout_height="wrap_content"/>
                <LinearLayout android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="#3CF1EBF1"
                    android:id="@+id/wnd">

                    <Space android:layout_width="wrap_content"
                        android:layout_height="5dp"/>
                    <TextView android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="12dp"
                        android:text="Wind"
                        android:textColor="#000000"
                        android:textStyle="bold"/>
                    <TextView android:id="@+id/wind"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="14dp"
                        android:textStyle="bold"
                        android:textColor="#000000"
                     />
                </LinearLayout>
            </LinearLayout>

            <Space android:layout_width="wrap_content"
                android:layout_height="10dp"/>

            <LinearLayout android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:weightSum="3">
                <LinearLayout android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="#3CF1EBF1"
                    android:id="@+id/presd"
                    >

                    <Space android:layout_width="wrap_content"
                        android:layout_height="5dp"/>
                    <TextView android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="12dp"
                        android:text="Pressure"
                        android:textColor="#000000"

                        android:textStyle="bold"/>
                    <TextView android:id="@+id/pressure"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="14dp"
                        android:textStyle="bold"
                        android:textColor="#000000"
             />
                </LinearLayout>
                <Space android:layout_width="10dp"
                    android:layout_height="wrap_content"/>
                <LinearLayout android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:padding="8dp"
                    android:background="#3CF1EBF1"
                    android:id="@+id/humd">

                    <Space android:layout_width="wrap_content"
                        android:layout_height="5dp"/>
                    <TextView android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="12dp"
                        android:textStyle="bold"
                        android:text="Humidity"
                        android:textColor="#000000"/>
                    <TextView android:id="@+id/humidity"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:textSize="14dp"
                        android:textStyle="bold"
                        android:textColor="#000000"
                     />
                </LinearLayout>

            </LinearLayout>
        </LinearLayout>

        <EditText
            android:id="@+id/city"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="131dp"
            android:ems="10"
            android:inputType="textPersonName"
            android:hint="ENTER NAME OF CITY"
            android:textColor="#000000"/>

        <Button
            android:id="@+id/button2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="224dp"
            android:onClick="run"
            android:text="SEARCH TEMPERATURE"
            android:textColor="#000000"/>

    </RelativeLayout>


    <ProgressBar android:id="@+id/loader"
        android:layout_width="wrap_content"

        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:visibility="gone"/>

    <TextView android:id="@+id/errorText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:visibility="gone"
        android:textColor="#000000"
        android:text="Something went wrong"/>


</RelativeLayout>