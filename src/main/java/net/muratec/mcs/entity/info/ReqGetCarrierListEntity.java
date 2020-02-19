//@formatter:off
/**
 ******************************************************************************
 * @file        ReqGetCarrierListEntity.java
 * @brief       キャリア情報表示画面の一覧取得リクエストエンティティ
 * @par
 * @author      CSC
 * $Id:         $
 * @attention
 *
 * Copyright (c) 2016 MURATA MACHINERY,LTD. All rights reserved.
 *
 * @note        Tabstop=4
 * ----------------------------------------------------------------------------
 * DATE       VER.        DESCRIPTION                                    AUTHOR
 * ----------------------------------------------------------------------------
 * 2016/12/26 0.1         Step1リリース                                     CSC
 ******************************************************************************
 */
//@formatter:on
package net.muratec.mcs.entity.info;

import java.lang.reflect.Field;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import net.muratec.mcs.annotation.FieldNameKey;
import net.muratec.mcs.entity.common.AjaxDataTablesReqBaseEntity;

//@formatter:off
/**
 ******************************************************************************
 * @brief     一覧取得リクエストエンティティクラス
 * @par       機能:
 *              toString（インスタンスの文字列表現を返す）
 * @attention
 * @note
 * ----------------------------------------------------------------------------
 * VER.        DESCRIPTION                                               AUTHOR
 * ----------------------------------------------------------------------------
 ******************************************************************************
 */
//@formatter:on
@Getter
@Setter
public class ReqGetCarrierListEntity extends AjaxDataTablesReqBaseEntity {

    // ------------------------------------
    // キャリアID
    // ------------------------------------
    @FieldNameKey(key = "II-002-02-001") public String carrierId;

    // ------------------------------------
    // ゾーン
    // ------------------------------------
    @FieldNameKey(key = "II-002-02-003") public String zone;

    // ------------------------------------
    // キャリアアラーム
    // ------------------------------------
    @FieldNameKey(key = "II-002-02-005, LocationSelectBox_Input.language.labels.controller") public Short carrierAlarm;

    // ------------------------------------
    // ロケーション2
    // ------------------------------------
    @FieldNameKey(key = "II-002-02-007, LocationSelectBox_Input.language.labels.port") public String controller;

    // ------------------------------------
    // ロケーション3
    // ------------------------------------
    @FieldNameKey(key = "II-002-02-007") public String port;

    // Step4P2 2017_11_16：ログ出力内容修正
    // ------------------------------------
    // 在庫日時（開始）
    // ------------------------------------
    @FieldNameKey(key = "II-002-02-011, II-002-02-012") public Timestamp from;

    // ------------------------------------
    // 在庫日時（終了）
    // ------------------------------------
    @FieldNameKey(key = "II-002-02-011, II-002-02-013") public Timestamp to;

    //@formatter:off
    /**
     ******************************************************************************
     * @brief     toString（インスタンスの文字列表現を返す）機能
     * @return    インスタンスの文字列表現
     * @retval    String形式で返却
     * @attention
     * @note      インスタンスの文字列表現を返す
     * ----------------------------------------------------------------------------
     * VER.        DESCRIPTION                                               AUTHOR
     * ----------------------------------------------------------------------------
     ******************************************************************************
     */
    //@formatter:on
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            boolean accessible = field.isAccessible();
            try {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(this);
                sb.append(' ').append(name).append('=').append(value != null ? value.toString() : "null");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            field.setAccessible(accessible);
        }
        return sb.toString();
    }
}
