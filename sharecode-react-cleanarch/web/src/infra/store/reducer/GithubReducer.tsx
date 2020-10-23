const INITIAL_STATE = {
  
  data: {}
}

export const githubReducer = (state = INITIAL_STATE, action: any) => {
  switch (action.type) {
      case 'SET_DATA':
          return {
              ...state,
              data: action.data,
          };
      default:
          return state;
  }
}
