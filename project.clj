(defproject acyclic.temporal "0.1.0-SNAPSHOT"
  :author "Peter Fraenkel <http://podsnap.com>"
  :description "Management of inhomogenous temporal data"
  :url "http://github.com/pnf/temporal"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [digest "1.4.4"]
                 [clj-time "0.7.0"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [com.datomic/datomic-pro "0.9.4766.11" :exclusions [[org.slf4j/log4j-over-slf4j]]]
                 [com.taoensso/timbre "3.2.0"] 
                 [org.clojure/tools.reader "0.8.5"]
                 [org.clojure/tools.cli "0.3.1"]]
  :aot [acyclic.temporal.testutils.bitemp]
  :uberjar-name "temporal.jar"
)
