import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {},
  mutations: {},
  actions: {},
  modules: {
    user: {
      namespaced: true,
      state: {
        user: {
          name: "name from store"
        }
      },
      mutations: {
        SET_USER(state, user) {
          state.user = user;
        }
      },
      actions: {
        setUser({ commit, dispatch }, user) {
          commit("SET_USER", user);
          // commit("count/INCREMENT", null, { root: true }); // should't call other module's mutation
          dispatch("count/increment", null, { root: true });
        }
      }
    },
    count: {
      namespaced: true,
      state: {
        count: 0
      },
      mutations: {
        INCREMENT(state) {
          state.count = state.count + 1;
        }
      },
      actions: {
        increment({ commit }) {
          commit("INCREMENT");
        }
      }
    }
  }
});
