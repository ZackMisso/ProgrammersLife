//
//  AssignmentGenerator.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/10/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Assignment.h"
#import "Player.h"

@interface AssignmentGenerator : NSObject{
    
}

-(Assignment*)generateHardAssignment:(Player*)player;
-(Assignment*)generateMediumAssignment:(Player*)player;
-(Assignment*)generateEasyAssignment:(Player*)player;
-(NSMutableArray*)generateBatchOfAssignments:(Player*)player;

@end
