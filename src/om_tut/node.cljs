(ns om-tut.node
  (:require [om-tut.core :as core]
            [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [clojure.string :as string]
            [cljs.nodejs :as nodejs]
            ))

;(nodejs/enable-util-print!)


(defn ^export -main []
   (set! module.exports.getRegistryHtml (fn []
     (dom/render-to-str (om/build core/registry-view @core/app-state))))
   (set! module.exports.getClassesHtml (fn []
     (dom/render-to-str (om/build core/classes-view @core/app-state)))))

(-main)

(set! *main-cli-fn* -main)
